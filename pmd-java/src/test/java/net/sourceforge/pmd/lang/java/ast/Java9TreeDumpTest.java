/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.junit.Test;

import net.sourceforge.pmd.lang.ast.test.BaseParsingHelper;
import net.sourceforge.pmd.lang.java.BaseJavaTreeDumpTest;
import net.sourceforge.pmd.lang.java.JavaParsingHelper;

public class Java9TreeDumpTest extends BaseJavaTreeDumpTest {

    private final JavaParsingHelper java9 = JavaParsingHelper.DEFAULT
        .withDefaultVersion("9")
        .withResourceContext(Java9TreeDumpTest.class, "jdkversiontests/java9");

    @Test
    public void testModule() {
        doTest("jdk9_module_info");
    }

    @Test
    public void testAnnotatedModule() {
        doTest("jdk9_module_info_with_annot");
    }

    @Override
    public @NonNull BaseParsingHelper<?, ?> getParser() {
        return java9;
    }
}