package com.geo.decconv.model;

import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tidus on 12/10/2017.
 */
public class ConvertOperationList extends ObservableListBase<ConvertOperation> implements ObservableList<ConvertOperation> {
    private List<ConvertOperation> convertOperations;

    public ConvertOperationList() {
        super();
        convertOperations = new ArrayList<>();
    }

    @Override
    public ConvertOperation get(int index) {
        return convertOperations.get(index);
    }

    @Override
    public int size() {
        return convertOperations.size();
    }

    @Override
    public boolean addAll(ConvertOperation... elements) {
        return false;
    }

    @Override
    public boolean setAll(ConvertOperation... elements) {
        return false;
    }

    @Override
    public boolean removeAll(ConvertOperation... elements) {
        return false;
    }

    @Override
    public boolean retainAll(ConvertOperation... elements) {
        return false;
    }

    @Override
    public boolean add(ConvertOperation operation) {
        convertOperations.add(operation);
        return true;
    }

    @Override
    public ConvertOperation set(int index, ConvertOperation element) {
        return convertOperations.set(index, element);
    }

    @Override
    public void add(int index, ConvertOperation element) {
        convertOperations.add(index, element);
    }
}
