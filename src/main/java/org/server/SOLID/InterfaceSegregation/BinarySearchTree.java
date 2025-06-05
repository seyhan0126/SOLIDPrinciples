package org.server.SOLID.InterfaceSegregation;

public class BinarySearchTree implements Tree{
    @Override
    public void insert() {
        System.out.println("Inserting a new element...");
    }

    @Override
    public void delete() {
        System.out.println("Removing a element...");
    }

    @Override
    public void traverse() {
        System.out.println("In-order traversal in O(N)...");
    }
}
