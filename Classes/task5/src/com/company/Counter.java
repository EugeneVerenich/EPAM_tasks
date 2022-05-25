package com.company;

public class Counter {
    private int min, max, current;
    public Counter(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;
        // в случае неправильного задания параметров
        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }
        if (current < min)
            current = min;
        if (current > max)
            current = max;
    }
    public Counter(int min_, int max_) {
        this(min_, max_, min_);
        current = min;
    }
    public Counter() {
        this(0, 16, 0);
    }
    public void increment() {
        current++;
        if (current > max)
            current = min;
    }
    public void decrement() {
        current--;
        if (current < min)
            current = max;
    }
    public int value() {
        return current;
    }
}
