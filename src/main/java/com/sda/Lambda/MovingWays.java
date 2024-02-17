package com.sda.Lambda;
@FunctionalInterface
public interface MovingWays {
    void slowMove();
    default void averageMove() {
        System.out.println("Average move");
    }
    default void fastMove() {
        System.out.println("Fast move");
    };
}
