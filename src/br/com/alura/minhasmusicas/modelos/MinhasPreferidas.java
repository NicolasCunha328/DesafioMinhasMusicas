package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificados() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        }else {
            System.out.println(audio.getTitulo() + " também é dos que todo mundo está curtindo!");
        }
    }
}
