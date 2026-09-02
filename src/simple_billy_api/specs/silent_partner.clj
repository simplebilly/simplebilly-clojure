(ns simple-billy-api.specs.silent-partner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.instrument-type :refer :all]
            )
  (:import (java.io File)))


(def silent-partner-data
  {
   (ds/opt :contractDate) inst?
   (ds/opt :einlage) string?
   (ds/opt :gewinnquotePct) string?
   (ds/opt :gewinnvortrag) string?
   (ds/req :instrumentType) instrument-type-spec
   (ds/opt :kestPflichtig) boolean?
   (ds/opt :name) string?
   (ds/opt :notes) string?
   (ds/opt :verlustVerrechnungskonto) string?
   (ds/opt :verlustbeteiligung) boolean?
   })

(def silent-partner-spec
  (ds/spec
    {:name ::silent-partner
     :spec silent-partner-data}))
