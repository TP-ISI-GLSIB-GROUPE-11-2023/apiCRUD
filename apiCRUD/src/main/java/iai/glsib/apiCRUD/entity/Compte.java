package iai.glsib.apiCRUD.entity;

@Entity
@Table(name = "Compte")
public class Compte {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @Size(max = 9)
        private String numCpt;

        @NotBlank
        @Size(max = 100)
        private String typeCpt;

        @NotBlank
        @Size(max = 100)
        private String password;

        // constructeurs, getters et setters


}

@Entity
@Table(name = "comptes")
public class Compte {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @Size(max = 50)
        private String nom;

        private double solde;

        private Client propriétaire;

        // Constructors
        public Compte() {
        }

        public Compte(String nom, double solde) {
                this.nom = nom;
                this.solde = solde;
        }

        // Accesseurs
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public double getSolde() {
                return solde;
        }

        public void setSolde(double solde) {
                this.solde = solde;
        }
}

