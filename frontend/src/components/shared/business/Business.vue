<template>
    <div>
        <v-row>
            <v-col>
                <v-card class="company">
                    <v-text-field
                        class="field"
                        v-model="company"
                        label="Análise"
                        outlined
                        readonly
                    ></v-text-field>
                    <v-text-field
                        class="field"
                        v-model="role"
                        label="Data"
                        outlined
                        readonly
                    ></v-text-field>
                </v-card>
            </v-col>
        </v-row>
    </div>
</template>
<script>
export default {
    props: [
      'company',
      'role'
    ],
}
</script>
<style scoped>
.comp_card {
  left: 25px;
  top: 71px;

  background: #EBF1FC;
}
.company {
    padding: 0 auto;
    display: inline-block;
    margin: 5px;
    vertical-align: top;
    text-align: center;
    background-color: #EBF1FC !important;
    height: 90%;
}

.field {
    color: white;
    size: 200px;
    margin-top: 10px !important;
    margin-left: 10px !important;
    margin-right: 10px !important;
    margin-bottom: 1px !important;
}
</style>