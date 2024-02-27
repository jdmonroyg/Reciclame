"use client";

import React from "react";
import Link from "next/link";
import Image from "next/image";
import { IconComment } from "../Icons/SearchIcon";
import { IconBell } from "../Icons/SearchIcon";
import MenuIconLog from "../Icons/MenuIconLog";
import Submenu from "../Submenu";

export default function HeaderLogin() {
  return (
    <div className="fixed left-0 top-0 z-50 -mb-12 w-full bg-white">
      <header className="shadow-xl">
        <nav className="relative m-auto flex h-16 max-w-7xl justify-between">
          <ul className="m-2 flex items-center gap-4 p-2">
            <Link href={"/"}>
              <Image
                width={150}
                height={50}
                src="/image/reciclame.svg"
                className="mr-10 flex p-2"
                alt="reciclame"
              ></Image>
            </Link>
            <Link className="hidden p-1 md:block border-secondary-violet hover:border-b-2" href={"/"}>
              Home
            </Link>
            <Link className="hidden p-1 md:block border-secondary-violet hover:border-b-2" href={"/explorar"}>
              Explorar
            </Link>
            <Link className="hidden p-1 md:block border-secondary-violet hover:border-b-2" href={"/blog"}>
              Blog
            </Link>
          </ul>
          <ul className="m-2 flex items-center gap-7 p-2">
            <MenuIconLog />
            <Link
              className="hidden w-40 rounded-full bg-accent-yellow p-2 text-center font-bold text-black md:block"
              href={"/nuevopost"}
            >
              Publicar +
            </Link>
            <Link href={"/notificaciones"}>
              <IconBell />
            </Link>
            <IconComment />

            <Submenu />
          </ul>
        </nav>
      </header>
    </div>
  );
}
