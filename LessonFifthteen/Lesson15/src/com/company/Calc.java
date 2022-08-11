package com.company;

public enum Calc {
    plus{
        @Override
        public float calc(float x, float y) {
            return x + y;
        }
    },  // +
    minus{
        @Override
        public float calc(float x, float y) {
            return x - y;
        }
    }, // -
    malt{
        @Override
        public float calc(float x, float y) {
            return x * y;
        }
    },  // *
    div{
        @Override
        public float calc(float x, float y) {
            return x / y;
        }
    };    // /

    public abstract float calc(float x, float y);
}
