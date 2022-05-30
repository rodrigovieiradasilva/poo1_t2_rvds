#include <stdio.h>
#include <stdlib.h>
#include <string.h>


struct cadastro{
    int cod;
    int numcpf;
    char namefabricante[50];
    int numcep;
    int datanasc;
    int dtingre;
    char nome[50];
    float valor;
};


int main(void){
  struct cadastro produto;
  int opcao;
   do{
    system("cls");
    printf("\nMENU PRINCIPAL\n");
    printf("1 - Digite para cadastrar o produto\n");
    printf("2 - Digite para listar todos produtos disponiveis\n");
    printf("3 - Digite para cadastrar o Cliente\n");
    printf("4 - Digite para cadastrar o Funcionario\n");
    printf("5 - Agora se vc quer sair\n");
    printf("\n Seja bem vindo agora digite a opcao desejada:\n");
    scanf("%d", &opcao);
    system("cls");
      switch(opcao){
          case 1:
             printf("\nDigite o codigo do produto desejado:\n");
             scanf("%d", &produto.cod);
             fflush(stdin);
             printf("\nDigite o nome do produto desejado:\n");
             scanf("%s", produto.nome);
             fflush(stdin);
             printf("\nDigite o valor do produto:\n");
             scanf("%f", &produto.valor);
             fflush(stdin);
             printf("\nCadastro realizado conforme informacoes inseridas PARABENS");
             system("pause");
             break;
          
          case 2:
             printf("\nAgora voce deve digitar o cpf do cliente:\n");
             scanf("%d", &produto.numcpf);
             fflush(stdin);
             printf("\nDigite o nome do Cliente:\n");
             scanf("%s", produto.nome);
             fflush(stdin);
             printf("\nAgora voce deve digitar a data de nascimento do cliente:\n");
             scanf("%d", &produto.datanasc);
             fflush(stdin);
             printf("\nDigite o CEP do Cliente caso tenha duvidas acesse o site do correios:\n");
             scanf("%d", &produto.numcep);
             fflush(stdin);
             printf("\n PARABENS processo salvo com sucesso SEJA BEM VINDO!");
             system("pause");
             break;
          case 3:
             printf("\n Agora vc deve digitar o CPF:\n");
             scanf("%d", &produto.numcpf);
             fflush(stdin);
             printf("\n Agora digite o Nome do Funcionario:\n");
             scanf("%s", produto.nome);
             fflush(stdin);
             printf("\n Agora vc deve digitar a Data de Nascimento:\n");
             scanf("%d", &produto.datanasc);
             fflush(stdin);
             printf("\nAgora Digite a Data de Ingresso:\n");
             scanf("%d", &produto.dtingre);
             fflush(stdin);
             printf("\nCadastro salvo com sucesso PARABENS");
             system("pause");
             break;
        }
    } while(opcao != 4);
}