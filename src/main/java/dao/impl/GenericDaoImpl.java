package main.java.dao.impl;

import main.java.annotation.processor.FileStorageProcessor;
import main.java.dao.GenericDao;
import main.java.domain.BaseEntity;
import main.java.util.Reader;
import main.java.util.Writer;
import main.java.util.impl.TextFileReader;
import main.java.util.impl.TextFileWriter;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {

    final Writer<String> writer;
    final Reader<String> reader;
    final Function<Object, T> mapper;
    private final String path;

    protected GenericDaoImpl(Class<T> typeParameterClass, Function<Object, T> mapper) {
        this.writer = TextFileWriter.getInstance();
        this.reader = TextFileReader.getInstance();
        this.mapper = mapper;
        this.path = FileStorageProcessor.getInstance().getPath(typeParameterClass);
    }

    @Override
    public Optional<T> save(T t) {
        final Collection<T> collection = getCollection();
        t.setId(generateId(collection));
        collection.add(t);
        writer.write(path, collection);
        return Optional.of(t);
    }

    @Override
    public Optional<T> update(T t) {
        final Collection<T> collection = getCollection();
        final List<T> list = getUpdatedList(t, collection);
        writer.write(path, list);
        return Optional.of(t);
    }

    @Override
    public Collection<T> getAll() {
        return getCollection();
    }

    @Override
    public Optional<T> getById(Long id) {
        final Collection<T> collection = getCollection();
        return collection.stream()
                .filter((o) -> o.getId().equals(id))
                .findFirst();
    }

    @Override
    public void delete(T t) {
        Collection<T> collection = getCollection();
        final List<T> list = collection.stream()
                .filter((o) -> !(o.getId().equals(t.getId())))
                .collect(toList());
        writer.write(path, list);
    }

    @Override
    public void deleteAll() {
        writer.write(path, new ArrayList<>());
    }

    @Override
    public void deleteById(Long id) {
        final Collection<T> collection = getCollection();
        final List<T> list = collection.stream()
                .filter((o) -> !(o.getId().equals(id)))
                .collect(toList());
        writer.write(path, list);
    }

    private Collection<T> getCollection() {
        return reader.read(path)
                .stream()
                .map(mapper)
                .collect(toList());
    }

    private Long generateId(Collection<T> collection) {
        final Optional<Long> longOptional = collection.stream()
                .map(BaseEntity::getId)
                .max(Comparator.naturalOrder());
        return longOptional.orElse(0L) + 1L;
    }

    private List<T> getUpdatedList(T t, Collection<T> collection) {
        final Optional<T> elementOptional = collection.stream().
                filter((o) -> o.getId().equals(t.getId()))
                .findFirst();
        final T element = elementOptional.orElseThrow(() -> new RuntimeException("Can not update a non-existing object!"));
        return collection.stream()
                .map((o) -> o.getId().equals(element.getId()) ? t : o)
                .collect(toList());
    }
}
