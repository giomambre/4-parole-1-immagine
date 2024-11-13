/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piattaformav2;


public class Utente {
protected String nome;
protected int punteggio_quattro , punteggio_logo;;

Utente(String nome) {
this.nome = nome;


}

public void aggiungiPuntiQuattro(int punto)
{
     punteggio_quattro++;   
    
}

public void aggiungiPuntiLogo(int punto)
{
     punteggio_logo++;   
    
}


    public String getNome() {
        return nome;
    }

    public int getPunteggio_quattro() {
        return punteggio_quattro;
    }

    public int getPunteggio_logo() {
        return punteggio_logo;
    }


}
