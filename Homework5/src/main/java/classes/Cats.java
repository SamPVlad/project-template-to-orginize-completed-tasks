package classes;

public class Cats extends Animals {
    
        private String className;

    
        
        
        /**  constructor */

    public Cats() {
            super();
        }

        public Cats(String name) {
            super(name);
        }

        public Cats(String name, int age, String canTalk, String className) {
            super(name, age, canTalk);
            this.className = className;
        }

    
        
        /**  getters setters  */
        
        public String getClassName() {
            return className;
        }

        public void setClassName(String name) {
            System.out.println("setClassName " + className);
            this.className = className;
        }

    /**  class methods  */
        
    }

