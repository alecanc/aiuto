package com.example.gestioneprofilo;
import java.io.IOException;
import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class ControlGestioneProfilo {
   /* public class Profilo {
        // Costruttore
        public Profilo() {
            this.nome = nome;
            this.giornoNascita = giornoNascita;
            this.email = email;
            this.codiceFiscale = codiceFiscale;
        }
        private String nome;
        private String giornoNascita;
        private String email;
        private String codiceFiscale;

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getGiornoNascita(){
            return this.giornoNascita;

        }
        public void setGiornoNascita(String GiornoNascita){
            this.giornoNascita=giornoNascita;
        }
        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String getCodiceFiscale() {
            return this.codiceFiscale;
        }

        public void setCodiceFiscale(String codiceFiscale) {
            this.codiceFiscale = codiceFiscale;
        }
    }
*/

    private String URL = "jdbc:mysql://localhost:3306/Azienda";
    private String username = "root";
    private String password = "root1234";


     SchermataVisualizzaProfilo schermataVisualizzaProfilo = new SchermataVisualizzaProfilo();

    @FXML
    public void visualizzaProfilo(ActionEvent event) throws IOException, SQLException {
try {
    Connection conn = DriverManager.getConnection(URL, username, password);
    String sql = "SELECT nome, giornoNascita, email, codiceFiscale FROM Impiegato WHERE matricola = '0001'";
    PreparedStatement pstm = conn.prepareStatement(sql); // Manca una "s" prima di Statement

    ResultSet rs = pstm.executeQuery();
    if (rs.next()) {
      //  Profilo profilo = new Profilo();
       String n=rs.getString("nome");
      //  profilo.setGiornoNascita(rs.getString("giornoNascita"));
      //  profilo.setEmail(rs.getString("email"));
        //  profilo.setCodiceFiscale(rs.getString("codiceFiscale"));


        // Mostra la schermata della classe destinazione passando l'oggetto "profilo" come parametro
        schermataVisualizzaProfilo.show(event,n/*, profilo*/);
    }

}catch(SQLException e){
    System.out.println("erore");
}
        }



    }
