package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
@NotBlank(message =  "Preencha o campo corretamente.")

  private String nome;
  @NotBlank(message =  "Preencha o campo corretamente.")
  private String cpf;
  @NotBlank(message =  "Preencha o campo corretamente.")
  private String bairro;
 @NotNull
 @Past(message = "Data invalida")
  private LocalDate dataDeNascimento;

}
