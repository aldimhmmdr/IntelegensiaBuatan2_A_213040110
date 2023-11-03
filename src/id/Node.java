package id;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nilai;
    private List<Node> tetangga;
    private boolean kunjungi;

    public Node(String nilai) {
        tetangga = new ArrayList<>();
        this.nilai = nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getNilai() {
        return nilai;
    }

    public void setTetangga(List<Node> tetangga) {
        this.tetangga = tetangga;
    }

    public List<Node> getTetangga() {
        return tetangga;
    }

    public void addTetangga(Node node) {
        tetangga.add(node);
    }

    public boolean dikunjungi() {
        return kunjungi;
    }

    public void setKunjungi(boolean kunjungi) {
        this.kunjungi = kunjungi;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return ((Node) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}