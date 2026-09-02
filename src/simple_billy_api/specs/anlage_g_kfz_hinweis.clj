(ns simple-billy-api.specs.anlage-g-kfz-hinweis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def anlage-g-kfz-hinweis-data
  {
   (ds/req :bezeichnung) string?
   (ds/req :kennzeichen) string?
   (ds/req :privat_anteil_prozent) string?
   })

(def anlage-g-kfz-hinweis-spec
  (ds/spec
    {:name ::anlage-g-kfz-hinweis
     :spec anlage-g-kfz-hinweis-data}))
