"use client";
import React, { useContext } from "react";
import Link from "next/link";
import { getDaysInMonth, getMonthsOfYear, getYears } from "../../utils/functions";
import { useForm } from "react-hook-form";
import  { useRouter } from "next/navigation";

function FormRegister() {
    const days = Array.from({ length: getDaysInMonth(2022, 2) }, (_, i) => i + 1);
  const months = getMonthsOfYear();
  const years = getYears();

  const router = useRouter();

  const {register, handleSubmit} = useForm()
  return (
    <form
       className="flex h-full w-full flex-col items-center justify-center gap-6 overflow-y-auto bg-white p-5  md:px-24 md:py-10"
      
       onSubmit={handleSubmit((data) => {
        console.log(data);
        router.push("/configuracion");
        
      })}
      >
        <p className="text-star w-full text-2xl font-bold uppercase">
          registrarse
        </p>
        <div className="flex w-full flex-col justify-center gap-2">
          <label className="capitalize">nombre</label>
          <input
            type="text"
            className="h-12 w-full rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383] "
            placeholder="Nombre"
            id="name"
            {...register("name")}
          />
        </div>
        <div className="flex w-full flex-col justify-center gap-2">
          <label className="capitalize">correo electronico</label>
          <input
            type="email"
            className="h-12 w-full rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383] "
            placeholder="Correo electronico"
            id="email"
            {...register("email")}
          />
        </div>
        <div className="flex w-full flex-col justify-center gap-2">
          <div className="flex items-center">
            <label className="font-[400] capitalize">contraseña</label>
          </div>
          <div>
            <input
              type="password"
              className="h-12 w-full rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383] "
              placeholder="Contraseña"
              id="password"
              {...register("password")}
            />
          </div>
        </div>
        <div className="flex w-full flex-col justify-center gap-2">
          <div className="flex items-center">
            <label className="font-[400] capitalize">
              confirmar contraseña
            </label>
          </div>
          <div>
            <input
              type="password"
              className="h-12 w-full rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383] "
              placeholder="Contraseña"
              id="confirmPassword"
              {...register("confirmPassword")}
            />
          </div>
        </div>
        <div className="flex w-full gap-5 ">
          <div className="flex w-[80%] flex-col justify-center gap-2">
            <div className="flex items-center justify-between">
              <label className="font-[400] capitalize">ciudad</label>
            </div>
            <div>
              <input
                type="text"
                className="h-12 w-full rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383] "
                placeholder="Ciudad"
                id="city"
                {...register("city")}
              />
            </div>
          </div>
          <div className="flex w-[80%] flex-col justify-center gap-2">
            <div className="flex items-center justify-between">
              <label className="font-[400] capitalize">provincia</label>
            </div>
            <div>
              <input
                type="text"
                className="h-12 w-full rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383] "
                placeholder="Provincia"
                id="province"
                {...register("province")}
              />
            </div>
          </div>
        </div>
        <div className="flex w-full flex-col gap-2 ">
          <label className="font-[400] capitalize">fecha de nacimiento</label>
          <div className="flex items-center gap-3">
            <select
             className="rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383]"
             {...register("day")}>
                <option >dd</option>
              {days.map((day) => (
                <option key={day} value={day}>
                  {day}
                </option>
              ))}
            </select>
            <select
             className="rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383]"
             {...register("month")}>
                <option value="" >mm</option>
              {months.map((month, index) => (
                <option key={index} value={index + 1}>
                  {month}
                </option>
              ))}
            </select>
            <select 
            className=" rounded-3xl border-2 border-[#838383] p-3 placeholder-[#838383]"
            {...register("year")}>
              <option value="">yyyy</option>
              {years.map((year) => (
                <option key={year} value={year}>
                  {year}
                </option>
              ))}
            </select>
          </div>
        </div>

        <div className="w-full">
          <button
            className="md:w-[40%] rounded-3xl  p-3 text-white bg-primary-green w-full "
            type="submit"
          >
            Registrate
          </button>
        </div>
        <div className="w-full flex justify-center">
          <p className="md:text-star flex justify-center md:justify-normal w-full gap-2 text-lg">
            ¿ Tienes cuenta?{" "}
            <Link href="/login" className="text-lg  font-[500] underline ">
              Inicia sesion
            </Link>
          </p>
        </div>
      </form>
  )
}

export default FormRegister