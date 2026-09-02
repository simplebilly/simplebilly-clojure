(ns simple-billy-api.specs.euer-zeile
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def euer-zeile-data
  {
   (ds/req :abschnitt) string?
   (ds/req :betrag) string?
   (ds/req :bezeichnung) string?
   (ds/req :zeile) int?
   })

(def euer-zeile-spec
  (ds/spec
    {:name ::euer-zeile
     :spec euer-zeile-data}))
