(ns simple-billy-api.specs.stille-partner-zeile
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def stille-partner-zeile-data
  {
   (ds/req :auseinandersetzungsguthaben) string?
   (ds/req :gewinnanteil) string?
   (ds/req :gewinnvortrag) string?
   (ds/opt :hinweis) string?
   (ds/req :instrument_type) string?
   (ds/req :kest) string?
   (ds/req :name) string?
   (ds/req :verlust_verrechnungskonto) string?
   (ds/req :verlustanteil) string?
   })

(def stille-partner-zeile-spec
  (ds/spec
    {:name ::stille-partner-zeile
     :spec stille-partner-zeile-data}))
