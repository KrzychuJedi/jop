/* AUTOGENERATED from com.jopdesign.tools.Instruction */
/* CAVEAT: Do not change manually */

package com.jopdesign.timing.jop;
public class MicrocodeConstants {
  public static final int POP             = 0x0; /* consumer */ 
  public static final int AND             = 0x1; /* consumer */ 
  public static final int OR              = 0x2; /* consumer */ 
  public static final int XOR             = 0x3; /* consumer */ 
  public static final int ADD             = 0x4; /* consumer */ 
  public static final int SUB             = 0x5; /* consumer */ 
  public static final int STMUL           = 0x6; /* consumer */ 
  public static final int STMWA           = 0x7; /* consumer */ 
  public static final int STMRA           = 0x8; /* consumer */ 
  public static final int STMWD           = 0x9; /* consumer */ 
  public static final int STALD           = 0xa; /* consumer */ 
  public static final int STAST           = 0xb; /* consumer */ 
  public static final int STGF            = 0xc; /* consumer */ 
  public static final int STPF            = 0xd; /* consumer */ 
  public static final int STCP            = 0xe; /* consumer */ 
  public static final int STBCRD          = 0xf; /* consumer */ 
  public static final int ST0             = 0x10; /* consumer */ 
  public static final int ST1             = 0x11; /* consumer */ 
  public static final int ST2             = 0x12; /* consumer */ 
  public static final int ST3             = 0x13; /* consumer */ 
  public static final int ST              = 0x14; /* consumer */ 
  public static final int STMI            = 0x15; /* consumer */ 
  public static final int STVP            = 0x18; /* consumer */ 
  public static final int STJPC           = 0x19; /* consumer */ 
  public static final int STAR            = 0x1a; /* consumer */ 
  public static final int STSP            = 0x1b; /* consumer */ 
  public static final int USHR            = 0x1c; /* consumer */ 
  public static final int SHL             = 0x1d; /* consumer */ 
  public static final int SHR             = 0x1e; /* consumer */ 
  public static final int STM             = 0x20; /* consumer opd */ 
  public static final int BZ              = 0x40; /* consumer opd jmp */ 
  public static final int BNZ             = 0x60; /* consumer opd jmp */ 
  public static final int NOP             = 0x80; /* nostack */ 
  public static final int WAIT            = 0x81; /* nostack */ 
  public static final int JBR             = 0x82; /* nostack */ 
  public static final int LDM             = 0xa0; /* producer opd */ 
  public static final int LDI             = 0xc0; /* producer opd */ 
  public static final int LDMRD           = 0xe0; /* producer */ 
  public static final int LDMUL           = 0xe6; /* producer */ 
  public static final int LDBCSTART       = 0xe7; /* producer */ 
  public static final int LD0             = 0xe8; /* producer */ 
  public static final int LD1             = 0xe9; /* producer */ 
  public static final int LD2             = 0xea; /* producer */ 
  public static final int LD3             = 0xeb; /* producer */ 
  public static final int LD              = 0xec; /* producer */ 
  public static final int LDMI            = 0xed; /* producer */ 
  public static final int LDSP            = 0xf0; /* producer */ 
  public static final int LDVP            = 0xf1; /* producer */ 
  public static final int LDJPC           = 0xf2; /* producer */ 
  public static final int LD_OPD_8U       = 0xf4; /* producer */ 
  public static final int LD_OPD_8S       = 0xf5; /* producer */ 
  public static final int LD_OPD_16U      = 0xf6; /* producer */ 
  public static final int LD_OPD_16S      = 0xf7; /* producer */ 
  public static final int DUP             = 0xf8; /* producer */ 
};
