// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//p → r,  q → r,  p ∨ q  ⊢ r

@pure def imply2(p: B, q: B, r: B): Unit = {
  Deduce(
    ( p __>: r, q __>: r, p | q ) |- ( r )
      Proof(
        //PROOF GOES HERE
<<<<<<< HEAD
        1 ( p __>: r ) by Premise,
        2 ( q __>: r ) by Premise,
        3 ( p | q ) by Premise,

        //OrE on p | v
        4 SubProof(
          5 Assume(p),
          6 ( r ) by ImplyE(1,5),
        ),

        7 SubProof(
          8 Assume(q),
          9 ( r ) by ImplyE(2, 8),
        ),
        
        10 ( p | q ) by OrE(3, 4, 7)
=======
        1 (  p __>: r          ) by Premise,
        2 (  q __>: r          ) by Premise,
        3 (  p | q          ) by Premise,
     
        //OrE on p | q
        4 SubProof(
          5 Assume(  p  ),
          6 (  r                     ) by ImplyE(1, 5)

          //goal: r
      ),
      7 SubProof(
          8 Assume (  q  ),
          9 (  r            ) by ImplyE(2, 8)
      ),
      10 (  r             ) by OrE(3, 4, 7)
>>>>>>> 7ad0da7b5bcbf06c4797bf0f8ba19716015cd3ca
    )
  )

}