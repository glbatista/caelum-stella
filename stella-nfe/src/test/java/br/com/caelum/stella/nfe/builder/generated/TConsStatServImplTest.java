package br.com.caelum.stella.nfe.builder.generated; public final class TConsStatServImplTest {  @org.junit.Test  public void testTConsStatServInterface()  { TConsStatServ tConsStatServ = new TConsStatServImpl().withTpAmb("abc").withCUF("abc").withXServ("abc").withVersao("abc"); assertModelWasFilled(tConsStatServ); }private void assertModelWasFilled(TConsStatServ tConsStatServ) { new br.com.caelum.stella.nfe.builder.BuilderTestHelper (tConsStatServ).assertModelWasFilled();} }