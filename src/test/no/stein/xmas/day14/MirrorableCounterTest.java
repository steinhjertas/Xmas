package no.stein.xmas.day14;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class MirrorableCounterTest {
	@Test
	public void test_101_is_mirror() throws Exception {
		MirrorableCounter theMirror = new MirrorableCounter();
		assertThat(theMirror.isMirror(101), is(true));
	}
	@Test
	public void test_1_is_mirror() throws Exception {
		MirrorableCounter theMirror = new MirrorableCounter();
		assertThat(theMirror.isMirror(1), is(true));
	}
	@Test
	public void test_916_is_mirror() throws Exception {
		MirrorableCounter theMirror = new MirrorableCounter();
		assertThat(theMirror.isMirror(916), is(true));
	}
	@Test
	public void test_8008_is_mirror() throws Exception {
		MirrorableCounter theMirror = new MirrorableCounter();
		assertThat(theMirror.isMirror(8008), is(true));
	}
	
	@Test
	public void test_1001_is_mirror() throws Exception {
		MirrorableCounter theMirror = new MirrorableCounter();
		assertThat(theMirror.isMirror(1001), is(true));
	}
	@Test
	public void test_22345_is_no_mirror() throws Exception {
		MirrorableCounter theMirror = new MirrorableCounter();
		assertThat(theMirror.isMirror(22345), is(false));
	}
	@Test
	public void test_160080061_is_no_mirror() throws Exception {
		MirrorableCounter theMirror = new MirrorableCounter();
		assertThat(theMirror.isMirror(160080061), is(false));
	}
	
	@Test
	public void test_all_under_100_000() throws Exception {
		MirrorableCounter theMirror = new MirrorableCounter();
		System.out.println("The Answer: " + theMirror.mirrorsUnder(100000));
	}
}
