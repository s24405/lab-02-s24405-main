package org.example.tools;

import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.List;


public class HierarchyBuilder<TItem extends org.example.model.abstraction.IHaveHierarchicalStructure>{

    private List<TItem> elements;
    public void setElements(List<TItem> geographies) {
        this.elements = elements;
    }

    public void buildHierarchy() {
        //todo
    }

    public TItem getRootElement() {
        //todo
        return null;
    }
}


