package taller02_linkedlist_garcia.carlos;

public class Taller02_LinkedList_GarciaCarlos {
    public static void main(String[] args) {
        
        // Ejercicio 1: Dividir lanzamientos 
        System.out.println("========================= Ejercicio 1: Dividir lanzamientos ========================= ");
        
        // Lista de numeros enteros 
        LinkedList<Integer> lanzamientos1 = new LinkedList<>();
        lanzamientos1.addLast(3);
        lanzamientos1.addLast(5);
        lanzamientos1.addLast(2);
        lanzamientos1.addLast(7);
        lanzamientos1.addLast(4);
        lanzamientos1.addLast(8);
        lanzamientos1.addLast(6);
        lanzamientos1.addLast(10);
        lanzamientos1.addLast(8);
        
        System.out.println("a. Lista de varios elementos");
        System.out.println("Lista unificada de entrada: "+lanzamientos1);
        
        LinkedList<Integer>[] jugadores1 = LinkedList.dividirLanzamientos(lanzamientos1);
        System.out.println("Resulado devuelto, un arreglo donde: ");
        System.out.println("(Jugador 1) -> "+jugadores1[0]);
        System.out.println("(Jugador 2) -> "+jugadores1[1]);
        System.out.println("(Jugador 3) -> "+jugadores1[2]);
        
        
        // Lista de un elemento
        LinkedList<Integer> lanzamientos2 = new LinkedList<>();
        lanzamientos2.addLast(3);
        
        System.out.println("\nb. Lista de un elemento");
        System.out.println("Lista unificada de entrada: "+lanzamientos2);
        
        LinkedList<Integer>[] jugadores2 = LinkedList.dividirLanzamientos(lanzamientos2);
        System.out.println("Resulado devuelto, un arreglo donde: ");
        System.out.println("(Jugador 1) -> "+jugadores2[0]);
        System.out.println("(Jugador 2) -> "+jugadores2[1]);
        System.out.println("(Jugador 3) -> "+jugadores2[2]);
        
        // Lista vacia 
        LinkedList<Integer> lanzamientos3 = new LinkedList<>();
        
        System.out.println("\nc. Lista vacia");
        System.out.println("Lista unificada de entrada: "+lanzamientos3);
        
        LinkedList<Integer>[] jugadores3 = LinkedList.dividirLanzamientos(lanzamientos3);
        System.out.println("Resulado devuelto, un arreglo donde: ");
        System.out.println("(Jugador 1) -> "+jugadores3[0]);
        System.out.println("(Jugador 2) -> "+jugadores3[1]);
        System.out.println("(Jugador 3) -> "+jugadores3[2]);
        
        
        // Ejercicio 2: Pedidos por cliente
        System.out.println("\n========================= Ejercicio 2: Pedidos por Cliente  ========================= ");
        
        // Lista de varios elementos string
        LinkedList<String> p1 = new LinkedList<>();
        p1.addLast("Mouse");
        p1.addLast("Teclado");

        LinkedList<String> p2 = new LinkedList<>();
        p2.addLast("Monitor");
        p2.addLast("PC");

        LinkedList<String> p3 = new LinkedList<>();
        p3.addLast("Audifonos");
        p3.addLast("Camara");

        LinkedList<Pedido> pedidos1 = new LinkedList<>();

        pedidos1.addLast(new Pedido(1, "Carlos", p1));
        pedidos1.addLast(new Pedido(2, "Ana", p2));
        pedidos1.addLast(new Pedido(3, "Carlos", p3));
        
        System.out.println("a. Lista de varios elementos");
        List<String> res1 = LinkedList.getPedidosPorCliente(pedidos1, "Carlos");
        System.out.println("Resultado devuelto de Cliente1 (Carlos): "+res1);
        List<String> res2 = LinkedList.getPedidosPorCliente(pedidos1, "Ana");
        System.out.println("Resultado devuelto de Cliente2 (Ana): "+res2);
        
        // Lista de un elemento
        LinkedList<String> p4 = new LinkedList<>();
        p4.addLast("Queso");
        
        LinkedList<Pedido> pedidos2 = new LinkedList<>();

        pedidos2.addLast(new Pedido(1, "Roberto", p4));
        
        System.out.println("\nb. Lista de un elemento");
        List<String> res3 = LinkedList.getPedidosPorCliente(pedidos2, "Roberto");
        System.out.println("Resultado devuelto de Cliente3 (Roberto): "+res3);
        
        // Lista vacia
        LinkedList<String> p5 = new LinkedList<>();
        
        LinkedList<Pedido> pedidos3 = new LinkedList<>();

        pedidos3.addLast(new Pedido(1, "Roberto", p5));
        
        System.out.println("\nc. Lista vacia");
        List<String> res4 = LinkedList.getPedidosPorCliente(pedidos3, "Juan");
        System.out.println("Resultado devuelto de Cliente4 (Juan): "+res4);
        
        
        // Ejercicio 3: Sumar Menores 
        System.out.println("\n========================= Ejercicio 3: Sumar Menores ========================= ");
        
        // Lista de varios elementos
        LinkedList<Integer> listaA = new LinkedList<>();
        listaA.addLast(5);
        listaA.addLast(10);
        listaA.addLast(1);
        listaA.addLast(6);
        listaA.addLast(3);
        
        LinkedList<Integer> listaB = new LinkedList<>();
        listaB.addLast(5);
        listaB.addLast(2);
        listaB.addLast(4);
        listaB.addLast(6);
        listaB.addLast(10);
        
        LinkedList<Integer> resultado1 = LinkedList.sumarMenores(listaA, listaB); 
        
        System.out.println("a. Lista de varios elementos");
        System.out.println("Lista A: " + listaA);
        System.out.println("Lista B: " + listaB);
        System.out.println("Lista Resultante: " + resultado1);
        
        // Listas de un elemento
        LinkedList<Integer> listaC = new LinkedList<>();
        listaC.addLast(9);
        
        LinkedList<Integer> listaD = new LinkedList<>();
        listaD.addLast(7);
        
        LinkedList<Integer> resultado2 = LinkedList.sumarMenores(listaC, listaD); 
        
        System.out.println("\nb. Listas de un elemento");
        System.out.println("Lista C: " + listaC);
        System.out.println("Lista D: " + listaD);
        System.out.println("Lista Resultante: " + resultado2);
        
        // Lista vacia
        LinkedList<Integer> listaE = new LinkedList<>();
        
        LinkedList<Integer> listaF = new LinkedList<>();
        
        LinkedList<Integer> resultado3 = LinkedList.sumarMenores(listaE, listaF); 
        
        System.out.println("\nc. Listas vacia");
        System.out.println("Lista E: " + listaE);
        System.out.println("Lista F: " + listaF);
        System.out.println("Lista Resultante: " + resultado3);
        
        
        // Ejercicio 4: Sumar Menores 
        System.out.println("\n========================= Ejercicio 4: Buscar Palabras Menores ========================= ");
        
        // Lista de varios elementos
        LinkedList<String> palabras1 = new LinkedList<>();
        palabras1.addLast("Hola");
        palabras1.addLast("Muricelago");
        palabras1.addLast("Tahuantinsuyo");
        palabras1.addLast("Toreo");
        palabras1.addLast("Mundial");
        palabras1.addLast("Tsunami");
        palabras1.addLast("Cromos");
        
        System.out.println("a. Lista de varios elementos");
        System.out.println("Lista original: "+palabras1);
        
        List<String> ordenado1 = LinkedList.getStringsShorterThan(palabras1, 7);
        
        System.out.println("Lista Retornada (Menor a 9): "+ordenado1);
        
        // Lista de un elemento
        LinkedList<String> palabras2 = new LinkedList<>();
        palabras2.addLast("Estructura");
        
        System.out.println("\nb. Lista de un elemento");
        System.out.println("Lista original: "+palabras2);
        
        List<String> ordenado2 = LinkedList.getStringsShorterThan(palabras2, 7);
        
        System.out.println("Lista Retornada (Menor a 7): "+ordenado2);
        
        // Lista vacia
        LinkedList<String> palabras3 = new LinkedList<>();
        
        System.out.println("\nc. Lista vacia");
        System.out.println("Lista original: "+palabras3);
        
        List<String> ordenado3 = LinkedList.getStringsShorterThan(palabras3, 4);
        
        System.out.println("Lista Retornada (Menor a 4): "+ordenado3);
    }
}    
