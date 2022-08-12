--liquibase formatted sql

--changeset CREATE_AMINOACID_TABLE:DDL_1
CREATE TABLE AMINOACID(
    ID UUID NOT NULL PRIMARY KEY,
    NAME VARCHAR(150) NOT NULL,
    INITIALS VARCHAR(20) NOT NULL,
    SYMBOL VARCHAR(10) NOT NULL,
    RNA_CODON VARCHAR(10) NOT NULL,
    RNA_ANTI_CODON VARCHAR(10) NOT NULL,
    DESCRIPTION VARCHAR(400)
)

--changeset INSERT_AMINOACIDS:DML_2
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Alanina', 'Ala', 'A', 'GCU', 'CGA', 'É utilizado como fonte precursora do ácido pantatênico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Alanina', 'Ala', 'A', 'GCA', 'CGU', 'É utilizado como fonte precursora do ácido pantatênico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Alanina', 'Ala', 'A', 'GCC', 'CGG', 'É utilizado como fonte precursora do ácido pantatênico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Alanina', 'Ala', 'A', 'GCG', 'CGC', 'É utilizado como fonte precursora do ácido pantatênico.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Arginina', 'Arg', 'R', 'CGU', 'GCA','É um aminoácido necessário para manter as funções normais das vias sanguíneas e da resposta imunológica contra infecções.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Arginina', 'Arg', 'R', 'CGC', 'GCC','É um aminoácido necessário para manter as funções normais das vias sanguíneas e da resposta imunológica contra infecções.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Arginina', 'Arg', 'R', 'CGA', 'GCG','É um aminoácido necessário para manter as funções normais das vias sanguíneas e da resposta imunológica contra infecções.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Arginina', 'Arg', 'R', 'CGG', 'UCU','É um aminoácido necessário para manter as funções normais das vias sanguíneas e da resposta imunológica contra infecções.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Arginina', 'Arg', 'R', 'AGA', 'GCU','É um aminoácido necessário para manter as funções normais das vias sanguíneas e da resposta imunológica contra infecções.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Arginina', 'Arg', 'R', 'AGG', 'UCC','É um aminoácido necessário para manter as funções normais das vias sanguíneas e da resposta imunológica contra infecções.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Asparagina', 'Asn', 'N', 'AAU', 'UUA', 'É um aminoácido localizado próximo ao ciclo do Ácido Tricarboxílico (local de geração de energia) junto com o ácido aspártico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Asparagina', 'Asn', 'N', 'AAC', 'UUG', 'É um aminoácido localizado próximo ao ciclo do Ácido Tricarboxílico (local de geração de energia) junto com o ácido aspártico.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Ácido aspártico', 'Asp', 'D','GAU', 'CUA', 'Presente em grandes quantidades no aspargo. É uma fonte de energia de rápida atuação.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Ácido glutâmico', 'Glu', 'E', 'GAA', 'CUU', 'Presente em grandes quantidades no trigo e soja. É uma fonte de energia de rápida atuação.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Ácido glutâmico', 'Glu', 'E', 'GAG', 'CUC', 'Presente em grandes quantidades no trigo e soja. É uma fonte de energia de rápida atuação.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Cisteína', 'Cys ou Cis', 'C', 'UGU', 'ACA', 'Sua deficiencia é comum em crianças');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Cisteína', 'Cys ou Cis', 'C', 'UGC', 'ACG', 'Sua deficiencia é comum em crianças');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Glicina', 'Gli ou Gly', 'G', 'GGU', 'CCA', 'É usado para produção da glutationa e porfirina, um componente da hemoglobina.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Glicina', 'Gli ou Gly', 'G', 'GGA', 'CCU', 'É usado para produção da glutationa e porfirina, um componente da hemoglobina.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Glicina', 'Gli ou Gly', 'G', 'GGC', 'CCG', 'É usado para produção da glutationa e porfirina, um componente da hemoglobina.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Glicina', 'Gli ou Gly', 'G', 'GGG', 'CCC', 'É usado para produção da glutationa e porfirina, um componente da hemoglobina.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Glutamina', 'Gln', 'Q', 'CAA', 'GUU', 'É um aminoácido necessário para manter as funções normais do trato intestinal e dos músculos, bem como da defesa imunológica.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Glutamina', 'Gln', 'Q', 'CAG', 'GUC', 'É um aminoácido necessário para manter as funções normais do trato intestinal e dos músculos, bem como da defesa imunológica.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Histidina', 'His', 'H', 'CAU', 'GUA', 'É um aminoácido essencial usado para produzir histamina e outros componentes.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Histidina', 'His', 'H', 'CAC', 'GUG', 'É um aminoácido essencial usado para produzir histamina e outros componentes.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Isoleucina', 'Ile', 'I', 'AUA', 'UAU', 'É chamado aminoácidos de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Isoleucina', 'Ile', 'I', 'AUU', 'UAA', 'É chamado aminoácidos de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Isoleucina', 'Ile', 'I', 'AUC', 'UAG', 'É chamado aminoácidos de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Leucina', 'Leu', 'L', 'UUA', 'AAU', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Leucina', 'Leu', 'L', 'UUG', 'AAC', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Leucina', 'Leu', 'L', 'CUU', 'GAA', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Leucina', 'Leu', 'L', 'CUC', 'GAG', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Leucina', 'Leu', 'L', 'CUA', 'GAU', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Leucina', 'Leu', 'L', 'CUG', 'GAC', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Lisina', 'Lis ou Lys', 'K', 'AAA', 'UUU', 'É um aminoácido essencial representativo e tende a ser insuficiente em dietas concentradas em trigo e arroz.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Lisina', 'Lis ou Lys', 'K', 'AAG', 'UUC', 'É um aminoácido essencial representativo e tende a ser insuficiente em dietas concentradas em trigo e arroz.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Metionina', 'Met', 'M', 'AUG', 'UAC', 'É um aminoácido essencial que é usado para produzir diversas substâncias necessárias à nutrição, à resposta imunológica e à defesa contra agressões.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Fenilalanina', 'Phe ou Fen', 'F', 'UUU', 'AAA', 'É um aminoácido essencial usado para produzir diversos aminoácidos úteis.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Fenilalanina', 'Phe ou Fen', 'F', 'UUC', 'AAG', 'É um aminoácido essencial usado para produzir diversos aminoácidos úteis.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Prolina', 'Pro', 'P', 'CCU', 'GGA', 'É o principal componente do "colágeno", que constitui a pele e outros tecidos. Atua como fonte de energia de rápida atuação.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Prolina', 'Pro', 'P', 'CCA', 'GGU', 'É o principal componente do "colágeno", que constitui a pele e outros tecidos. Atua como fonte de energia de rápida atuação.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Prolina', 'Pro', 'P', 'CCC', 'GGG', 'É o principal componente do "colágeno", que constitui a pele e outros tecidos. Atua como fonte de energia de rápida atuação.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Prolina', 'Pro', 'P', 'CCG', 'GGC', 'É o principal componente do "colágeno", que constitui a pele e outros tecidos. Atua como fonte de energia de rápida atuação.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Serina', 'Ser', 'S', 'UCU', 'AGA', 'É usado para produção de fosfolipídios e ácido glicérico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Serina', 'Ser', 'S', 'UCC', 'AGG', 'É usado para produção de fosfolipídios e ácido glicérico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Serina', 'Ser', 'S', 'UCA', 'AGU', 'É usado para produção de fosfolipídios e ácido glicérico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Serina', 'Ser', 'S', 'UCG', 'AGC', 'É usado para produção de fosfolipídios e ácido glicérico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Serina', 'Ser', 'S', 'AGU', 'UCA', 'É usado para produção de fosfolipídios e ácido glicérico.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Serina', 'Ser', 'S', 'AGC', 'UCG', 'É usado para produção de fosfolipídios e ácido glicérico.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Tirosina', 'Tir ou Tyr', 'Y', 'UAU', 'AUA', 'É usado para produzir diversos aminoácidos úteis e é chamado aminoácido aromático, junto com a fenilalanina e o triptofano.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Tirosina', 'Tir ou Tyr', 'Y', 'UAC', 'AUG', 'É usado para produzir diversos aminoácidos úteis e é chamado aminoácido aromático, junto com a fenilalanina e o triptofano.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Treonina', 'Tre ou Thr', 'T', 'ACU', 'UGA', 'É um aminoácido essencial usado para suplementação de proteínas de cereais.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Treonina', 'Tre ou Thr', 'T', 'ACA', 'UGU', 'É um aminoácido essencial usado para suplementação de proteínas de cereais.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Treonina', 'Tre ou Thr', 'T', 'ACC', 'UGG', 'É um aminoácido essencial usado para suplementação de proteínas de cereais.');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Treonina', 'Tre ou Thr', 'T', 'ACG', 'UGC', 'É um aminoácido essencial usado para suplementação de proteínas de cereais.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Triptofano', 'Trp', 'W', 'UGC', 'ACG', 'É um aminoácido essencial usado para produzir diversos aminoácidos úteis.');

INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Valina', 'Val', 'V', 'GUU', 'CAA', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no GUG CAG CAC aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Valina', 'Val', 'V', 'GUA', 'CAU', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no GUG CAG CAC aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Valina', 'Val', 'V', 'GUC', 'CAG', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no GUG CAG CAC aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');
INSERT INTO AMINOACID (ID, NAME, INITIALS, SYMBOL, RNA_CODON, RNA_ANTI_CODON, DESCRIPTION) VALUES(uuid_in(md5(random()::text || random()::text)::cstring), 'Valina', 'Val', 'V', 'GUG', 'CAC', 'É chamado de aminoácido de cadeia ramificada (BCAAs). Eles desempenham funções importantes no GUG CAG CAC aumento das proteínas e atuam como fonte de energia durante os exercícios. (aminoácidos essenciais)');






