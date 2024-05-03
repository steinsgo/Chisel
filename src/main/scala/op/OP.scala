import chisel3._

class OP extends Module {
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

object OP extends App {
  println(getVerilogString(new OP()))
}
