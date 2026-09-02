(ns simple-billy-api.specs.euer-kat-summe
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def euer-kat-summe-data
  {
   (ds/req :betrag) string?
   (ds/req :name) string?
   })

(def euer-kat-summe-spec
  (ds/spec
    {:name ::euer-kat-summe
     :spec euer-kat-summe-data}))
