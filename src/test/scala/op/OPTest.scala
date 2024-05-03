package op
import chisel3._

class OPTest extends Module {
  val io = IO(new Bundle {
    val in = Input(UInt(4.W))
    val out = Output(UInt(4.W))
  })

  io.out := io.in

  val two = 1 + 1
  println(two)
  val utwo = 1.U + 1.U
  println(utwo)
}

object OPTest extends App {
  println(getVerilogString(new OPTest()))
}
