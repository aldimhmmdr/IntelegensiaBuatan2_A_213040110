package id;
import id.bfs.BreadthFirstSearch;
import id.dls.DepthLimitedSearch;
import id.ucs.NodeUCS;
import id.ucs.UniformCostSearch;

public class TugasAI {
    public static void main(String[] args) {
        Node bandung            = new Node("Bandung");
        Node bojongsoang        = new Node("Bojosoang");
        Node cijambe            = new Node("Cijambe");
        Node kopo               = new Node("Kopo");
        Node margaasih          = new Node("Margaasih");
        Node cimenyan           = new Node("Cimenyan");
        Node setiabudi          = new Node("Setiabudi");
        Node cimahi             = new Node("Cimahi");
        Node lembang            = new Node("Lembang");
        Node cibiru             = new Node("Cibiru");

        bandung.addTetangga(cijambe);
        bandung.addTetangga(setiabudi);
        bandung.addTetangga(kopo);
        bandung.addTetangga(bojongsoang);

        bojongsoang.addTetangga(kopo);
        bojongsoang.addTetangga(cibiru);
        bojongsoang.addTetangga(bandung);

        cijambe.addTetangga(cimenyan);
        cijambe.addTetangga(bandung);
        cijambe.addTetangga(cibiru);

        kopo.addTetangga(bandung);
        kopo.addTetangga(margaasih);
        kopo.addTetangga(bojongsoang);

        margaasih.addTetangga(kopo);
        margaasih.addTetangga(setiabudi);
        margaasih.addTetangga(cimahi);

        cimenyan.addTetangga(lembang);
        cimenyan.addTetangga(cijambe);

        setiabudi.addTetangga(lembang);
        setiabudi.addTetangga(cimahi);
        setiabudi.addTetangga(margaasih);
        setiabudi.addTetangga(bandung);

        cimahi.addTetangga(setiabudi);
        cimahi.addTetangga(margaasih);

        lembang.addTetangga(setiabudi);
        lembang.addTetangga(cimenyan);

        cibiru.addTetangga(cijambe);
        cibiru.addTetangga(bojongsoang);

        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(cimahi, cibiru);

        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(20);
        dls.search(cimahi, cibiru);
        System.out.println();

//        A: Bandung 		- 52 | 48
//        B: Bojongsoang	- 45
//        C: Cijambe		- 15
//        D: Kopo			- 57 | 55
//        E: Margaasih		- 65 | 56
//        F: Cimenyan		- 23 | 17
//        G: Setiabudi		- 85 | 36
//        H: Cimahi		    - 112 | 39
//        I: Lembang		- 48 | 33
//        J: Cibiru			- 0  | 0
//
        NodeUCS Ubandung                = new NodeUCS(bandung, 48);
        NodeUCS Ubojongsoang            = new NodeUCS(bojongsoang, 45);
        NodeUCS Ucijambe                = new NodeUCS(cijambe, 15);
        NodeUCS Ukopo                   = new NodeUCS(kopo, 55);
        NodeUCS Umargaasih              = new NodeUCS(margaasih, 56);
        NodeUCS Ucimenyan               = new NodeUCS(cimenyan, 17);
        NodeUCS Usetiabudi              = new NodeUCS(setiabudi, 36);
        NodeUCS Ucimahi                 = new NodeUCS(cimahi, 39);
        NodeUCS Ulembang                = new NodeUCS(lembang, 33);
        NodeUCS Ucibiru                 = new NodeUCS(cibiru, 0);

//        NodeUCS Ubandung                = new NodeUCS(bandung, 52);
//        NodeUCS Ubojongsoang            = new NodeUCS(bojongsoang, 45);
//        NodeUCS Ucijambe                = new NodeUCS(cijambe, 15);
//        NodeUCS Ukopo                   = new NodeUCS(kopo, 57);
//        NodeUCS Umargaasih              = new NodeUCS(margaasih, 65);
//        NodeUCS Ucimenyan               = new NodeUCS(cimenyan, 23);
//        NodeUCS Usetiabudi              = new NodeUCS(setiabudi, 85);
//        NodeUCS Ucimahi                 = new NodeUCS(cimahi, 112);
//        NodeUCS Ulembang                = new NodeUCS(lembang, 48);
//        NodeUCS Ucibiru                 = new NodeUCS(cibiru, 0);

        Ubandung.addTetangga(Ucijambe);
        Ubandung.addTetangga(Usetiabudi);
        Ubandung.addTetangga(Ukopo);
        Ubandung.addTetangga(Ubojongsoang);

        Ubojongsoang.addTetangga(Ukopo);
        Ubojongsoang.addTetangga(Ucibiru);
        Ubojongsoang.addTetangga(Ubandung);

        Ucijambe.addTetangga(Ucimenyan);
        Ucijambe.addTetangga(Ubandung);
        Ucijambe.addTetangga(Ucibiru);

        Ukopo.addTetangga(Ubandung);
        Ukopo.addTetangga(Umargaasih);
        Ukopo.addTetangga(Ubojongsoang);

        Umargaasih.addTetangga(Ukopo);
        Umargaasih.addTetangga(Usetiabudi);
        Umargaasih.addTetangga(Ucimahi);

        Ucimenyan.addTetangga(Ulembang);
        Ucimenyan.addTetangga(Ucijambe);

        Usetiabudi.addTetangga(Ulembang);
        Usetiabudi.addTetangga(Ucimahi);
        Usetiabudi.addTetangga(Umargaasih);
        Usetiabudi.addTetangga(Ubandung);

        Ucimahi.addTetangga(Usetiabudi);
        Ucimahi.addTetangga(Umargaasih);

        Ulembang.addTetangga(Usetiabudi);
        Ulembang.addTetangga(Ucimenyan);

        Ucibiru.addTetangga(Ucijambe);
        Ucibiru.addTetangga(Ubojongsoang);

        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(Ucimahi, Ucibiru);
        System.out.println();
    }
}