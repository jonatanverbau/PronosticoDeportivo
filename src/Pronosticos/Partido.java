package Pronosticos;

public class Partido {
Equipo equipoLocal;
Equipo equipoVisitante;
int golesLocal;
int golesVisitante;
Enum<?> resultado;
int idPartido;
int fase;
int ronda;

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public Partido() {
    }

    public String getEquipoLocal() {
        return equipoLocal.getNombre();
    }

    public String getEquipoVisitante() {
        return equipoVisitante.getNombre();
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal){
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante){
        this.golesVisitante = golesVisitante;
    }

    public Enum<?> resultado(Equipo rEquipo) {
        if (golesLocal == golesVisitante) {
                resultado = ResultadoEnum.EMPATE;
            } else if (golesLocal < golesVisitante) {
                resultado = ResultadoEnum.DERROTA;
            } else if (golesLocal > golesVisitante){
                resultado = ResultadoEnum.VICTORIA;
            } 
        return resultado;
    }
}