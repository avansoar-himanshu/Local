public class Category {
        private String id;
        private String name;
        private Boolean active;

        public Category(String id, String name, Boolean active) {
            this.id = id;
            this.name = name;
            this.active = active;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Boolean getActive() {
            return active;
        }
    }


