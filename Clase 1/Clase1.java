public class Clase1 {

    public static class ejercicio1A {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int i = a;

            while (i <= b) {
                System.out.println(i);
                i++;
            }
        }
    }

    public static class ejercicio1B {
        public static void main(String[] args) {

            int a = 10;
            int b = 20;
            int i = a;

            while (i <= b) {
                if (i % 2 == 0)
                    System.out.println(i);
                i++;
            }

        }

    }

    public static class ejercicio1C {

        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int i = a;
            String tipo = "pares"; // "pares" o "impares"

            while (i <= b) {
                if ((tipo.equals("pares") && i % 2 == 0) || (tipo.equals("impares") && i % 2 != 0)) {
                    System.out.println(i);
                }
                i++;
            }

        }

    }

    public static class ejercicio1D {

        public static void main(String[] args) {

            int a = 10;
            int b = 20;

            for (int i = b; i > a; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }

        }
    }

    public static class ejercicio2 {

        public class miVehículo {
            private int cantidad;
            private int antigüedadDelMasViejo;
    
            public miVehículo(int cantidad, int antigüedadDelMasViejo) {
                this.cantidad = cantidad;
                this.antigüedadDelMasViejo = antigüedadDelMasViejo;
            }
    
            public int getCantidad() {
                return cantidad;
            }
    
            public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
            }
    
            public int getAntigüedadDelMasViejo() {
                return antigüedadDelMasViejo;
            }
    
            public void setAntigüedadDelMasViejo(int antigüedadDelMasViejo) {
                this.antigüedadDelMasViejo = antigüedadDelMasViejo;
            }
    
        }
    
        miVehículo miAuto = new miVehículo(3, 5);
    
        public static void main(Double ingresos, miVehículo vehiculos, int inmuebles, boolean embarcaciónOAvión) {
    
            Double máximo = 489.083;
    
            if (ingresos >= máximo || (vehiculos.cantidad > 3 && vehiculos.antigüedadDelMasViejo < 5) || inmuebles >= 3
                    || embarcaciónOAvión == true) {
                System.out.println("Esta persona pertenece al segmento de ingresos altos");
            } else {
                System.out.println("esta persona no pertenece al segmento de ingresos altos");
            }
    
        }
        
    }

}