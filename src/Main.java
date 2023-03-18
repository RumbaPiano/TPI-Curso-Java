public class Main {
    public static void main(String[] args) {
        Equipo equi1 = new Equipo("Argentina", "Seleccion");
        Equipo equi2 = new Equipo("Francia", "Seleccion");
        Equipo equi3 = new Equipo("Croacia", "Seleccion");
        Equipo equi4 = new Equipo("Marruecos", "Seleccion");

        Partido parti1 = new Partido(equi1,equi2,4,3);
        Partido parti2 = new Partido(equi3,equi4,2,2);

        Pronostico prono1 = new Pronostico(parti1,parti1.getEquipo1(),ResultadoEnum.ganador);
        Pronostico prono2 = new Pronostico(parti2,parti2.getEquipo2(),ResultadoEnum.empate);

        Ronda ronda1 = new Ronda("1");
        ronda1.agregarPronostico(prono1);
        ronda1.agregarPronostico(prono2);
        System.out.println("El participante obtuvo "+ronda1.puntos()+" punto/s en total en esta ronda");


    }
}