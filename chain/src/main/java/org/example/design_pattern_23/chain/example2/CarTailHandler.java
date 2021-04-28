package org.example.design_pattern_23.chain.example2;

/**
 * @author lifei
 */
public class CarTailHandler extends CarHandler {
    @Override
    public void handleCar() {
        System.out.println("组装车尾");
        if (this.nextHandler != null) {
            this.nextHandler.handleCar();
        }
    }
}
