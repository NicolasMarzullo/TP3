Programaci ́on Avanzada
Trabajo Practico No
3

Complejidad Computacional - Programaci ́on din ́amica

1
o
cuatrimestre 21017 (ambos turnos)
DIIT - Universidad Nacional de La Matanza

1. Introducci ́on
A trav ́es del presente trabajo se espera que los alumnos codifiquen, eval ́uen y comparen distintos
algoritmos que resuelven, mediante diferentes t ́ecnicas, el mismo problema.

2. Objetivos
2.1. Polinomios
Dise ̃nar un programa para evaluar un polinomio P(x) de grado n.
public c l a s s Polinomio {
private int grado ;
private double [ ] c o e f i c i e n t e s ;
//La p o s i c i o n 0 d e l a r r e g l o de c o e f i c i e n t e s c o n t i e n e e l c o e f i c i e n t e de grado n y l a
p o s i c i o n n c o n t i e n e a l term ino i n d e p e n d i e n t e .
public Polinomio { . . . }
double e v al u a rM S uc e si v a s (double x ) { . . . }
double e v al u a r R e c u r si v a (double x ) { . . . }
double e v al u a rR e c u r si v a P a r (double x ) { . . . }
double evalua rP rogDinamica (double x ) { . . . }
double e v alu a rMe j o r ad a (double x ) { . . . }
double evaluarPow (double x ) { . . . }
// y a s u g e r e n c i a de Lucas P
double e v al u a rH o r n e r ( double x ) { . . . }
}
1. Escribir evaluarMSucesivas utilizando c ́alculo de potencia por multiplicaciones sucesivas
2. Escribir evaluarRecursiva utilizando el siguiente c ́alculo de potencia recursiva:
a) Sin considerar si el exponente es par o impar:
p o t e n ci a ( x , n )=x∗ p o t e n ci a ( x , n−1)
b) Considerando si el exponente es par o impar:
Si n es par:
p o t e n ci a ( x , n )=p o t e n ci a ( x∗x , n / 2 )
Si n es impar
p o t e n ci a ( x , n )=x∗ p o t e n ci a ( x , n−1)

3. Escribir evaluarProgDinamica, almacenando las potencias de X ya calculadas.

1

4. Escribir evaluarMejorada, con un algoritmo de igual complejidad computacional que el anterior,
pero que ejecute en un tiempo menor.
5. Escribir evaluarPow, valiendose del metodo Math.pow(x,n) provisto por el lenguaje Java. Se
debe incluir dentro de alguno de los metodos anteriores donde se considere que es apropiado.
Investigue la CC de Math.pow.
6. Escribir evaluarHorner, aplicando el algoritmo de Horner de an ́alisis num ́erico. (Investigar)
2.2. Binomio de Newton
Dado un binomio de la forma (ax + b)

n, conocido como el Binomio de Newton, se desea:
1. Obtener el coeficiente del t ́ermino k del desarrollo de dicho binomio. Tener en cuenta que el
coeficiente k (el que corresponde al termino de x
k
) se calcula haciendo
n
k

a
k
b
n−k
.

2. Desarrolle tambi ́en, un m ́etodo que permita obtener todos los coeficientes del polinomio, o sea, el
desarrollo completo del binomio, y aplique los m ́etodos vistos en el punto anterior para evaluarlo
en alg ́un valor de x.
Desarrolle la class BinomioDeNewton, que permita cumplir con las consignas anteriores.
N ota: Investigar distintas t ́ecnicas para obtener los coeficientes del desarrollo del binomio. Estas
ser ́an recursivas y no recursivas. Usar t ́ecnicas de programaci ́on din ́amica con y sin memorizaci ́on. En
el c ́alculo de las potencias se podr ́an reutilizar los m ́etodos ya implementados.
3. An ́alisis de complejidad computacional

Indique la funci ́on de complejidada computacional asociada a cada uno de los m ́etodos implemen-
tados.

4. Gr ́aficos y tablas de rendimiento comparativo
Compare el tiempo de ejecuci ́on de todos los m ́etodos implementados en los puntos 2.1 y 2.2
Genere todos los casos que considere necesarios para realizar el an ́alisis.
5. Conclusiones
A partir de los an ́alisis comparativos extraiga conclusiones.
