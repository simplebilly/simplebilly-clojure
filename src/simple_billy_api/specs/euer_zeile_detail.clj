(ns simple-billy-api.specs.euer-zeile-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.euer-kat-summe :refer :all]
            )
  (:import (java.io File)))


(def euer-zeile-detail-data
  {
   (ds/req :abschnitt) string?
   (ds/req :betrag_gesamt) string?
   (ds/req :bezeichnung) string?
   (ds/req :kategorien) (s/coll-of euer-kat-summe-spec)
   (ds/req :zeile) int?
   })

(def euer-zeile-detail-spec
  (ds/spec
    {:name ::euer-zeile-detail
     :spec euer-zeile-detail-data}))
