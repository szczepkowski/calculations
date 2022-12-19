package pl.great.waw.calculations;

import pl.great.waw.calculations.exceptions.ProductNotExistException;

import java.util.ArrayList;
import java.util.List;

public class Calculations {

    private final List<Product> list = new ArrayList<>();

    public boolean add(Product product) {
        list.add(product);
        return true;
    }

    public Product get(int i) throws ProductNotExistException {
        if (list.size() - 1 < i) {
            throw new ProductNotExistException("Próbujesz pobrać indeks, który nie istnieje");
        }
        return list.get(i);
    }
}
