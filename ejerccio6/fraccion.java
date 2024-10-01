package ejerccio6;

class fraccion extends numerica {
    private int numerador;
    private int denominador;

    public fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }


    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        fraccion fraccion = (ejerccio6.fraccion) ob;
        return numerador == fraccion.numerador && denominador == fraccion.denominador;
    }

    @Override
    public numerica sumar(numerica numero) {
        if (numero instanceof fraccion) {
            fraccion otraFraccion = (fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El objeto no es una Fracción.");
    }

    @Override
    public numerica restar(numerica numero) {
        if (numero instanceof fraccion) {
            fraccion otraFraccion = (fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El objeto no es una Fracción.");
    }

    @Override
    public numerica multiplicar(numerica numero) {
        if (numero instanceof fraccion) {
            fraccion otraFraccion = (fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.numerador;
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El objeto no es una Fracción.");
    }

    @Override
    public numerica dividir(numerica numero) {
        if (numero instanceof fraccion) {
            fraccion otraFraccion = (fraccion) numero;
            if (otraFraccion.numerador == 0) {
                throw new IllegalArgumentException("División por cero.");
            }
            int nuevoNumerador = this.numerador * otraFraccion.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.numerador;
            return new fraccion(nuevoNumerador, nuevoDenominador);
        }
        throw new IllegalArgumentException("El objeto no es una Fracción.");
    }
}