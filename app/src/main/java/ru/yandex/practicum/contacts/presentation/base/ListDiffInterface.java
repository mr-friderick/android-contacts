package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T typeUi);

    @Override
    boolean equals(Object o);
}
