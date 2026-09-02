(ns simple-billy-api.specs.ustva-ergebnis
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ustva-ergebnis-data
  {
   (ds/req :bis) string?
   (ds/opt :hinweis) string?
   (ds/req :ist_kleinunternehmer) boolean?
   (ds/req :kz_41) string?
   (ds/req :kz_43) string?
   (ds/req :kz_46) string?
   (ds/req :kz_47) string?
   (ds/req :kz_61) string?
   (ds/req :kz_66) string?
   (ds/req :kz_67) string?
   (ds/req :kz_81) string?
   (ds/req :kz_83) string?
   (ds/req :kz_84) string?
   (ds/req :kz_85) string?
   (ds/req :kz_86) string?
   (ds/req :kz_88) string?
   (ds/req :kz_89) string?
   (ds/req :kz_93) string?
   (ds/req :von) string?
   (ds/req :zahllast) string?
   (ds/req :zeitraum) string?
   (ds/req :zeitraum_typ) string?
   })

(def ustva-ergebnis-spec
  (ds/spec
    {:name ::ustva-ergebnis
     :spec ustva-ergebnis-data}))
