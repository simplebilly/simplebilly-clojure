(ns simple-billy-api.specs.anlage-s-kfz-hinweis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def anlage-s-kfz-hinweis-data
  {
   (ds/req :bezeichnung) string?
   (ds/req :kennzeichen) string?
   (ds/req :privat_anteil_prozent) string?
   })

(def anlage-s-kfz-hinweis-spec
  (ds/spec
    {:name ::anlage-s-kfz-hinweis
     :spec anlage-s-kfz-hinweis-data}))
