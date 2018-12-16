package VisitorPattern;

/**
 * @author YNZ
 */
public interface Visitable {

    void accept(CarVisitor visitor);
}
