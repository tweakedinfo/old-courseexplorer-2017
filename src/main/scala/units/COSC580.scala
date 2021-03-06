package units

import info.tweaked.model.plan.Prerequisite.MinCP
import info.tweaked.model.unit._
import units.CBOK._


object COSC580 extends HasUnit {

  val it = new TeachingUnit(
    code = "COSC580",

    name = Some("Algorithms in Machine Learning"),

    description = Seq(
      """
        |This unit covers Algorithms in Machine Learning. There will be a theory component (including some basic probability and inference), and a programming component. You will be required to implement algorithms from pseudo code or mathematical descriptions, and perform analysis of algorithm behaviour and complexity in simple cases. Algorithms may be taken from supervised, unsupervised, or reinforcement learning.
      """.stripMargin
    ),

    outcomes = Seq(
      "demonstrate advanced programming skills in a high-level programming language;",
      "demonstrate advanced knowledge in algorithms related to machine learning;",
      "critically assess and appraise the approaches presented in this unit;",
      "demonstrate advanced problem-solving and algorithm-development skills; and",
      "apply these skills to complex datasets"
    ),

    prerequisite = MinCP(72), //COSC220 and

    taught = Seq(
      AssessmentDescription(
        title = "Lectures",
        cbok = Seq(abs(0), des(0), data(0), prog(0))
      ),
      AssessmentDescription(
        title = "Tutorials",
        cbok = Seq(abs(0), des(0), data(0), prog(0))
      )
    ),

    assessment = Seq(
      AssessmentDescription(
        title = "Math/theory/programming tasks",
        percentage = 10,
        lo = Seq(2,4),
        cbok = Seq(abs(6), des(3), data(6), prog(4))
      ),
      AssessmentDescription(
        title = "Math/theory/programming tasks",
        percentage = 15,
        lo = Seq(2,4,5),
        cbok = Seq(abs(6), des(3), data(6), prog(4))
      ),
      AssessmentDescription(
        title = "Math/theory/programming tasks",
        percentage = 15,
        lo = Seq(1,2,3,4),
        cbok = Seq(abs(6), des(3), data(6), prog(4))
      ),
      AssessmentDescription(
        title = "Math/theory/programming tasks",
        percentage = 15,
        lo = Seq(1,2,3,4),
        cbok = Seq(abs(6), des(3), data(6), prog(4))
      ),
      AssessmentDescription(
        title = "Exam",
        description = Some("Supervised examination"),
        percentage = 50,
        lo = Seq(1,2,3,4),
        cbok = Seq(abs(6), des(3), data(6), prog(4))
      )
    )
  )

}
