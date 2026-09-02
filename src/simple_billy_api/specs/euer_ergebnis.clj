(ns simple-billy-api.specs.euer-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.euer-zeile :refer :all]
            )
  (:import (java.io File)))


(def euer-ergebnis-data
  {
   (ds/req :anlage_zugaenge) string?
   (ds/req :gewinn_verlust) string?
   (ds/req :jahr) int?
   (ds/req :summe_ausgaben) string?
   (ds/req :summe_einnahmen) string?
   (ds/req :zeilen) (s/coll-of euer-zeile-spec)
   })

(def euer-ergebnis-spec
  (ds/spec
    {:name ::euer-ergebnis
     :spec euer-ergebnis-data}))
