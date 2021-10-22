package com.company;

public class Phone2_Parameters {
    class core{
        String core = "switched off";

        public void working(){
            core = "working";
            System.out.println("core is " + core);
        }

        public void notworking(){
            core = "not working";
            System.out.println("core is " + core );
        }
    }
    class memory{
        String memory = "switched off";

        public void working(){
            memory = "working";
            System.out.println("memory is " + memory);
        }

        public void notworking(){
            memory = "not working";
            System.out.println("memory is " + memory );
        }
    }

    core intelcore = new core();
    memory kingston = new memory();
}
