// This is a generated file. Not intended for manual editing.
package com.intellij.lang.jsgraphql.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.lang.jsgraphql.psi.impl.GraphQLDirectivesAware;
import  com.intellij.lang.jsgraphql.psi.impl.GraphQLTypeNameDefinitionOwnerPsiElement;

public interface GraphQLObjectTypeDefinition extends GraphQLTypeDefinition, GraphQLDirectivesAware, GraphQLTypeNameDefinitionOwnerPsiElement {

  @Nullable
  GraphQLFieldsDefinition getFieldsDefinition();

  @Nullable
  GraphQLImplementsInterfaces getImplementsInterfaces();

  @Nullable
  GraphQLTypeNameDefinition getTypeNameDefinition();

  @Nullable
  GraphQLQuotedString getDescription();

  @NotNull
  List<GraphQLDirective> getDirectives();

}