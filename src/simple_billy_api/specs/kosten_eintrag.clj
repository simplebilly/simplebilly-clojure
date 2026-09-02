(ns simple-billy-api.specs.kosten-eintrag
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def kosten-eintrag-data
  {
   (ds/req :beschreibung) string?
   (ds/req :betrag) string?
   (ds/req :datum) string?
   (ds/req :typ) string?
   })

(def kosten-eintrag-spec
  (ds/spec
    {:name ::kosten-eintrag
     :spec kosten-eintrag-data}))
