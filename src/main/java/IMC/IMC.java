package src.main.java.IMC;

public class IMC {
        public double ImcCalculo(double PesoDoUsuario, double AlturaDoUsuario) {
            double ResultadoImc = PesoDoUsuario / (AlturaDoUsuario * AlturaDoUsuario);
            return ResultadoImc;
        }
}
