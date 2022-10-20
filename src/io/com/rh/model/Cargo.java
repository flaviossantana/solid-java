package io.com.rh.model;

public enum Cargo {
//faltando isso na main
	ASSISTENTE {
		@Override
		public Cargo proximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo proximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo proximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo proximoCargo() {
			return GERENTE;
		}
	};

	public abstract Cargo proximoCargo();

}
