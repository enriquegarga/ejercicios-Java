package examen;

public class Libro {
    private int paginas, capitulos, existencia;
    private String autor, editorial, idioma, categoria;
    private float precio;
    
    public Libro(int paginas, int capitulos, int existencia, String autor, String editorial, String idioma, String categoria, float precio) {
        this.paginas = paginas;
        this.capitulos = capitulos;
        this.existencia = existencia;
        this.autor = autor;
        this.editorial = editorial;
        this.idioma = idioma;
        this.categoria = categoria;
        this.precio = precio;
    }
    public void prestamo() {
        
    }
    public void devolucion() {
        
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}