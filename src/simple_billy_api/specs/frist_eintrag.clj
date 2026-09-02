(ns simple-billy-api.specs.frist-eintrag
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def frist-eintrag-data
  {
   (ds/req :bezeichnung) string?
   (ds/req :faellig) string?
   (ds/req :faellig_original) string?
   (ds/opt :hinweis) string?
   (ds/req :typ) string?
   (ds/req :zeitraum) string?
   })

(def frist-eintrag-spec
  (ds/spec
    {:name ::frist-eintrag
     :spec frist-eintrag-data}))
